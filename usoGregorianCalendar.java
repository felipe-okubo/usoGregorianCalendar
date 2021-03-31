/**
 *
 * @author Felipe Yudi Okubo
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

 class Main{
  public static void main(String[] args){

    //Data de hoje.
    GregorianCalendar toDay = new GregorianCalendar();

    int day = toDay.get(Calendar.DAY_OF_MONTH);
    int month = toDay.get(Calendar.MONTH)+1;
    int year = toDay.get(Calendar.YEAR);
    
    System.out.println("A data de hoje é " + day + "/" + month + "/" + year);

     //Data daqui 15 dias.
    GregorianCalendar toDay15 = new GregorianCalendar();  
    toDay15.add(Calendar.DAY_OF_MONTH, 15);

    int day15 = toDay15.get(Calendar.DAY_OF_MONTH);
    int month15 = toDay15.get(Calendar.MONTH)+1;
    int year15 = toDay15.get(Calendar.YEAR);
    
    System.out.println("A data daqui 15 dias será: " + day15 + "/" + month15 + "/" + year15);


     //Data daqui 45 dias.
    GregorianCalendar toDay45 = new GregorianCalendar();
    toDay45.add(Calendar.DAY_OF_MONTH, 45);

    int day45 = toDay45.get(Calendar.DAY_OF_MONTH);
    int month45 = toDay45.get(Calendar.MONTH)+1;
    int year45 = toDay45.get(Calendar.YEAR);
    
    System.out.println("A data daqui 45 dias será: " + day45 + "/" + month45 + "/" + year45);
    
     //Data daqui 90 dias. 
    GregorianCalendar toDay90 = new GregorianCalendar();
    toDay90.add(Calendar.DAY_OF_MONTH, 90);

    int day90 = toDay90.get(Calendar.DAY_OF_MONTH);
    int month90 = toDay90.get(Calendar.MONTH)+1;
    int year90 = toDay90.get(Calendar.YEAR);
    
    System.out.println("A data daqui 90 dias será: " + day90 + "/" + month90 + "/" + year90);
    
    // DATA DO ANIVERSÁRIO
 
    GregorianCalendar birthDay = new GregorianCalendar(2021, Calendar.APRIL,30);
    
    int bornDay = birthDay.get(Calendar.DAY_OF_MONTH);
    int bornMonth = birthDay.get(Calendar.MONTH)+1;
    int bornYear = birthDay.get(Calendar.YEAR);
    int bornWeek = birthDay.get(Calendar.DAY_OF_WEEK);
    
    System.out.println("\n\nSeu aniversário é: " + bornDay + "/" + bornMonth + "/" + bornYear);
    
    // ANIVERSÁRIO POR EXTENSO.

        switch (bornWeek){
            case 1:
            System.out.println("O dia da semana do seu aniversário este ano será no domingo.");
            break;
             case 2:
            System.out.println("O dia da semana do seu aniversário este ano será na segunda-feira.");
            break;
             case 3:
            System.out.println("O dia da semana do seu aniversário este ano será na terça-feira.");
            break;
             case 4:
            System.out.println("O dia da semana do seu aniversário este ano será na quarta-feira.");
            break;
             case 5:
            System.out.println("O dia da semana do seu aniversário este ano será na quinta-feira.");
            break;
             case 6:
            System.out.println("O dia da semana do seu aniversário este ano será na sexta-feira.");
            break;
             case 7:
            System.out.println("O dia da semana do seu aniversário este ano será no sábado.");
            break;
            
            
            default:
        }
        
        // DATA DO NATAL
 
    GregorianCalendar christmasDay = new GregorianCalendar(2021, Calendar.DECEMBER,25);
    
    int chrisDay = christmasDay.get(Calendar.DAY_OF_MONTH);
    int chrisMonth = christmasDay.get(Calendar.MONTH)+1;
    int chrisYear = christmasDay.get(Calendar.YEAR);
    int chrisWeek = christmasDay.get(Calendar.DAY_OF_WEEK);
    
    System.out.println("\n\nO natal é dia: " + chrisDay + "/" + chrisMonth + "/" + chrisYear);
    
    // NATAL POR EXTENSO.

        switch (chrisWeek){
            case 1:
            System.out.println("O natal este ano será no domingo.");
            break;
             case 2:
            System.out.println("O natal este ano será na segunda-feira.");
            break;
             case 3:
            System.out.println("O natal este ano será na terça-feira.");
            break;
             case 4:
            System.out.println("O natal este ano será na quarta-feira.");
            break;
             case 5:
            System.out.println("O natal este ano será na quinta-feira.");
            break;
             case 6:
            System.out.println("O natal este ano será na sexta-feira.");
            break;
             case 7:
            System.out.println("O natal este ano será no sábado.");
            break;
            
            
            default:
        }
        
        // DATA DO ANO NOVO
 
    GregorianCalendar newYear = new GregorianCalendar(2021, Calendar.DECEMBER,31);
    
    int newDay = newYear.get(Calendar.DAY_OF_MONTH);
    int newMonth = newYear.get(Calendar.MONTH)+1;
    int newY = newYear.get(Calendar.YEAR);
    int newWeek = newYear.get(Calendar.DAY_OF_WEEK);
    
    System.out.println("\n\nO ano novo é dia: " + newDay + "/" + newMonth + "/" + newY);
    
    // ANO NOVO POR EXTENSO.

        switch (newWeek){
            case 1:
            System.out.println("O ano novo este ano será no domingo.");
            break;
             case 2:
            System.out.println("O ano novo este ano será na segunda-feira.");
            break;
             case 3:
            System.out.println("O ano novo este ano será na terça-feira.");
            break;
             case 4:
            System.out.println("O ano novo este ano será na quarta-feira.");
            break;
             case 5:
            System.out.println("O ano novo este ano será na quinta-feira.");
            break;
             case 6:
            System.out.println("O ano novo este ano será na sexta-feira.");
            break;
             case 7:
            System.out.println("O ano novo este ano será no sábado.");
            break;
            
            
            default:
        }      
  }
}