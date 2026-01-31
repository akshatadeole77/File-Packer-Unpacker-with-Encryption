//Copy file from one file to another
import java.io.*;
import java.util.*;

import javax.tools.FileObject;

class program577
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String str = null;

        File fobjsrc = null;
        File fobjDest = null;

        boolean bRet = false;

        String FileNameSrc = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1024];
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of Destination file : ");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjDest = new File(FileNameDest);

            fobjDest.createNewFile();

            FileInputStream fiobj = new FileInputStream (fobjsrc);
            FileOutputStream foobj = new FileOutputStream (fobjDest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                //System.out.print(str);
                foobj.write(Buffer, 0 , iRet);
                
            }

            System.out.println("File Copy successful\n");
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no source file");
        }
        
             
        sobj.close();
    }
}