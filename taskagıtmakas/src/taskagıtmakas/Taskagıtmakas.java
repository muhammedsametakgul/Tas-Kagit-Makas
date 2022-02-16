 
package taskagıtmakas;

import java.util.Random;
import java.util.Scanner;

 public class Taskagıtmakas {
 
    public static void main(String[] args) {
       int kisi,pc;
		//bilgisayarın 1 ile 3 aralığında random değer tutması lazım.
		Random rnd=new Random();
		pc=rnd.nextInt(3)+1; //bilgisayarın 1-3 aralıgında değer tutmasını sağladık.
		System.out.println("pc"+pc);
		System.out.println("1.taş");
		System.out.println("2.kağıt");
		System.out.println("3.makas");
		System.out.println("Lütfen seçiminizi yapınız");
		Scanner gelenioku=new Scanner(System.in);
		kisi=gelenioku.nextInt();
		if(kisi!=1 && kisi!=2 && kisi!=3)
		{
			System.out.println("yanlış bir seçim yapılmıştır.");
		}
		else 
		{ 
		
			if(pc==kisi)
			{
				System.out.println("berabere");
			}
			if(pc==1 &&kisi==2)
			{
				System.out.println("kişi kazandı");
			}
			if(pc==1 && kisi==3)
			{
				System.out.println("pc kazandı");
			}
			if(pc==2 && kisi==1)
			{
				System.out.println("pc kazandı");
			}			
			if(pc==2 && kisi==3)
			{
				System.out.println("kişi kazandı");
			}
			if(pc==3 && kisi==1)
			{
				System.out.println("kişi kazandı");
			}
			if(pc==3 && kisi==2)
			{
				System.out.println("pc kazandı");
			}
			System.out.println("seçtiğiniz değer:"+kisi);
                        System.out.println("pcnin seçtiği:"+pc);
		}
		
		
		
    }
    
}
