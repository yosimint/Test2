public class days {
    int dayDif = 0;
    if (monthC<monthB){
        yearDif--;
        for (int j = monthB; j <monthC;j++){
            dayDif = dayDif + dm[j-1];
        }
        dayDif = dayDif + dayB - dayC;
        int dayAge = dayDif + yearDif*365 + lY;
        System.out.println("Your days age is " + dayAge);

    } else{
        for (int j = monthB; j <monthC;j++){
          dayDif = dayDif + dm[j-1];
        }
        dayDif = dayDif + dayB - dayC;
        int dayAge = dayDif + yearDif*365 + lY;
        System.out.println("Your days age is " + dayAge);
    }
}
