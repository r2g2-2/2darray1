import java.util.Scanner;

public class Main {
    //פעולה שמקבלת מערך ונקודת שורות וטורים ובודקת אם הנקודה היא מספר צומת (מספר שסכום השורה וסכום הטור שווים)
    static int sum2dColum (int array[][],int lines, int coloms)
    {
        //הוספת משתני הסכום לשורה ולטור
        int sum1=0,sum2=0;
        //לולאה שתרוץ על השורה שקיבלנו ותוסיף את המספרים בשורה למשתנה סכום 1
        for (int i=0; i<array[lines].length; i++)
        {
            sum1=sum1+array[i][coloms];
        }
        //לולאה שתרוץ על השורות ותוסיף את המספרים של הטור שקיבלנו למשתנה סכום 2
        for (int i=0; i<array[coloms].length; i++)
        {
            sum2=sum2+array[lines][i];
        }
        //להשוות בין הסכומים ואם המספר הוא מספר צומת להחזיר 1 ואם לא להחזיר 0
        if (sum1==sum2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
        public static void main(String[] args)
        {
            int[][] values =
                    { {1, 1, 1}
                    , {1, 1, 1}
                    , {1, 1, 2} };
            //יצירת משתנה סכום
            int sum=0;
            //לולאה שתרוץ על השורות
            for (int i=0; i<values.length; i++)
            {
                //לולאה שתרוץ על הטורים
                for (int k=0; k<values[0].length; k++)
                {
                    //להריץ את המספר בפעולה שבודקת מספרי צומת ולהכניס את המספר שמקבלים מהפעולה למשתנה סכום
                    sum = sum + sum2dColum (values,i,k);
                }
            }
            //הדפסת משתנה הסכום
            System.out.println(sum);
        }
        }

