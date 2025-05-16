package Stringprograms;
import java.util.*;
/**
Write a program to assign a full path and file name as given below. 
Using library functions, extract and output the file path, file name 
and file extension separately as shown.
Input   C:\Users\admin\Pictures\flower.jpg 
Output 
Path: C:    \Users\admin\Pictures\
File name:     flowerExtension:    jpg
 */
public class File_path
{
    public void main()
    {
        Scanner sc= new Scanner (System.in);    
        System.out.println("Input the Full Path of any file with Extension");
        String p=sc.nextLine() ;
        int ex;
        int j = p.lastIndexOf('.');
        int i = p.lastIndexOf('\\');
        System.out.println(p.substring(0,j));
        System.out.println("file name : "+ p.substring(++i,j) +'\t'+"Extension : "+p.substring(++j));
    }
}
