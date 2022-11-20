public class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) throws DateException {
        this.month = month;
        this.setMonth(month);
        this.day = day;
        this.setDay(day);
        this.year = year;
        this.setYear(year);
    }

    //Checks if the day of the month is right

    public void setDay(int day) throws DateException {
        if ( day < 1 || day > this.getDaysMonth()) {
            throw new DateException("The day is not valid");
        }
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    //Check the month

    public void setMonth (int month) throws DateException {
        if ( month < 1 || month > 12) {
            throw new DateException("The month is not valid");
        }
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    //Check the year

    public void setYear (int year) throws DateException {
        if ( year < 0 ) {
            throw new DateException("The year is not valid");
        }
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    // Days of month

    public int getDaysMonth() {

        int numDays;

        numDays = 0;
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                numDays = 28;
                break;
        }

        return numDays;
    }

    //Method isSameYear

    public boolean isSameYear(Date another){

        boolean sameYear = false;

        if(this.year == another.getYear()){
            sameYear = true;
            System.out.println("The dates have the same year");
        }else{
            sameYear= false;
            System.out.println("The dates do not have the same year");
        }

        return sameYear;
    }

    //Method isSameMonth

    public boolean isSameMonth(Date another){

        boolean sameMonth = false;

        if(this.month == another.getMonth()){
            sameMonth = true;
            System.out.println("They dates have the same month");
        }else{
            sameMonth = false;
            System.out.println("The dates do not have the same month");
        }

        return sameMonth;
    }


    //Method isSameDay

    public boolean isSameDay(Date another){

        boolean sameDay = false;

        if(this.day == another.getDay()){
            sameDay = true;
            System.out.println("The dates have the same day");
        }
        else{
            sameDay = false;
            System.out.println("The dates do not have the same day");
        }

        return sameDay;
    }


    //Method isSame

    public boolean isSame(Date another){

        boolean same = false;

        if((this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear())){
            same = true;
            System.out.println("The dates are the same");
        }else{
            same = false;
            System.out.println("the dates are not the same");
        }

        return same;
    }


    //Returns the name of the month

    public String getNameMonth(){

        String nameMonth;

        nameMonth = "ERROR";
        switch (this.month){
            case 1:
                nameMonth = "January";
                break;
            case 2:
                nameMonth = "February";
                break;
            case 3:
                nameMonth = "March";
                break;
            case 4:
                nameMonth = "April";
                break;
            case 5:
                nameMonth = "May";
                break;
            case 6:
                nameMonth = "June";
                break;
            case 7:
                nameMonth = "July";
                break;
            case 8:
                nameMonth = "August";
                break;
            case 9:
                nameMonth = "September";
                break;
            case 10:
                nameMonth = "October";
                break;
            case 11:
                nameMonth = "November";
                break;
            case 12:
                nameMonth = "December";
                break;
        }
        return nameMonth;
    }

    //Returns the season of this month

    public String getSeason(){

        String season;

        season = "ERROR";

        switch (this.month){
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
        }
        return season;
    }

    //Return the months left until the end of the year

    public String getNumDaysUntilEndYear(){

        String NumDaysUntilEndYear;

        NumDaysUntilEndYear = "ERROR";

        switch (this.month){
            case 1:
                NumDaysUntilEndYear = "January,February,March,April,May,June,July,August,September,November,December";
                break;
            case 2:
                NumDaysUntilEndYear = "February,March,April,May,June,July,August,September,November,December";
                break;
            case 3:
                NumDaysUntilEndYear = "March,April,May,June,July,August,September,November,December";
                break;
            case 4:
                NumDaysUntilEndYear = "April,May,June,July,August,September,November,December";
                break;
            case 5:
                NumDaysUntilEndYear = "May,June,July,August,September,November,December";
                break;
            case 6:
                NumDaysUntilEndYear = "June,July,August,September,November,December";
                break;
            case 7:
                NumDaysUntilEndYear = "July,August,September,November,December";
                break;
            case 8:
                NumDaysUntilEndYear = "August,September,November,December";
                break;
            case 9:
                NumDaysUntilEndYear = "September,November,December";
                break;
            case 10:
                NumDaysUntilEndYear = "October,November,December";
                break;
            case 11:
                NumDaysUntilEndYear ="November,December";
                break;
            case 12:
                NumDaysUntilEndYear  = "December";
                break;
        }
        return NumDaysUntilEndYear;
    }

    //Returns the string version a date

    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }

    //Returns all dates until the end of the month

    public int getDatesUntilEndMonth() {

        int datesUntilEndMonth;

        datesUntilEndMonth = 0;

        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                datesUntilEndMonth = this.day - 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                datesUntilEndMonth = this.day - 30;
                break;
            case 2:
                datesUntilEndMonth = this.day - 28;
                break;
        }
        return datesUntilEndMonth;
    }

    //Returns the months with the same number of days as the month of this date

    public String getMonthsSameDays(){

        String months;

        switch(this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                months = "January,March,May,July,August,October,December";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                months = "April,June,September,November";
                break;
            default:
                months = "February";
        }

        return months;
    }
    //Count the number of days since the first day of the year
    public int daysPast() throws DateException{

        int numbs = 0;

        if(this.getMonth() == 1 && this.getDay() != 1) {
            numbs = this.getDay()-1;
        }
        else {
            int mes = this.getMonth();
            for(int i = 1; i < this.month ; i++) {
                this.setMonth(i);
                numbs = numbs + this.getDaysMonth();
            }
            if(this.getDay() == 31 && mes == 12 ) {
                numbs = 365 - getDaysMonth() - getDay()-1;
            }
        }
        return numbs;
    }
    //Method that counts the number of attempts needed to generate a random date
    public int getNumAttemptsRamdomDate(){

        int day0 = 0;
        int month0 = 0;
        int attemps = 0;

        while((day0 != this.day) && (month0 != this.month)){
            day0 = (int)((Math.random()*31)+1);
            month0 = (int)((Math.random()*12)+1);
            attemps = attemps + 1;
        }
        return attemps;
        }
    public String getDayOfWeek()throws DateException {

        String nameDayWeek = "ERROR";
        int dayWeek = this.daysPast() % 7;

        switch(dayWeek) {
            case 0:
                nameDayWeek = "Monday";
                break;
            case 1:
                nameDayWeek = "Tuesday";
                break;
            case 2:
                nameDayWeek = "Wednesday";
                break;
            case 3:
                nameDayWeek= "Thursday";
                break;
            case 4:
                nameDayWeek = "Friday";
                break;
            case 5:
                nameDayWeek = "Saturday";
                break;
            case 6:
                nameDayWeek = "Sunday";
                break;
        }
        return nameDayWeek;
    }



}
