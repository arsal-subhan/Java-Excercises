public class customeraccountnr {


    public static void main(String[] args) 
     {
     String a=args[0];
     char[] ziffer;
     //a=String.valueOf(eingabe);
     ziffer=new char[a.length()];
     
     
     int b;
     String c;
     int d;
     int summe=0;
     int checksumme;
     
     for(int i=0;i<a.length();i++)
     {
     ziffer[i]=a.charAt(i);
     b=Integer.parseInt(String.valueOf(ziffer[i]));
     
     
     //f(d) ist an der Position 1, 3,5 usw Deswegen i%2
     if(i%2!=0)
     {
     b=b*2;
     System.out.println("B*2 "+i+"Mal ist"+b);
     if(b>9)
     {
     //Zahl größer als 9 zerlegen und miteineneder addieren
     c=String.valueOf(b);
     d=Integer.parseInt(String.valueOf(c.charAt(0))) +Integer.parseInt(String.valueOf(c.charAt(1)));
     System.out.println("Die Addition einzelner Ziﬀer von b*2 ist "+d);
     b=d;
    
    
    }
     
    
    
    }
     //Alle b-Werte summieren
     summe=b+summe;
     System.out.println(i+" MAL SUMME="+summe);
     }
     System.out.println(" ENDSUMME="+summe);
     for(int j=0;j<10;j++)
     {
    
    
    if((summe+j)%10==0)
    
    
    {
    
    
    checksumme=j;
    
    
    System.out.println("Die checksumme ist "+checksumme);
    
    
    System.out.println("Die Kundennummer ist "+a+checksumme);
    
    
    break;
    
    
    }
    
    
    }
     
    
    
    }
    
    
    }
    