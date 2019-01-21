//package es.upm.grise.profundizacion2018.examenFinal;
//
//import java.util.Calendar;
//
//public class MyCalendar {
//
//    Calendar miCal;
//    MyCalendar (){
//        this.miCal = Calendar.getInstance();}
//
//    int get(){
//        return miCal.get(Calendar.HOUR_OF_DAY);
//    }
//
//    static TimeOfTheDay getMomentOfTheDay(int h){
//        TimeOfTheDay t;
//        if( h < 12 )
//            t = TimeOfTheDay.MORNING;
//        else if ( h < 18 )
//            t = TimeOfTheDay.AFTERNOON;
//        else
//            t = TimeOfTheDay.EVENING;
//        return t;
//    }
//}