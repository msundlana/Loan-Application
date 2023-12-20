import java.util.HashMap;
import java.util.Map;

public class Utility {
    private static Map<String,String> map = new HashMap<>();

    public static void main(String [] args){
        String strList = "BORROWER NAME=John A Merrick:Status=:LOAN NUMBER=1013976:CARRIER OPTION=USPS:EMAIL ADDRESS=id@anyone.net:MAILINGADDRESS =8 Hertage Rd ||Harico|MN|41228:CHALLENGEANSWER2=8769:COMMENT=Your Loan Package is Available!:PROPERTY ADDRESS ZIP CODE=43228:FIRST NAME=John:LAST NAME=Meridian:TELEPHONE NUMBER=804262-2118:PROPERTY ADDRESS STATE=VA:APPLICATION DATE=2016-02-27:MIDDLE NAME=A:PROPERTY ADDRESS 1=1138 Hermitage Rd:PROPERTY ADDRESS CITY=Henrico:PAPEROUT=true:CC=asmith@hello.com,pwalker@marshquarry.com:SENDER EMAIL ADDRESS=respa@any.com:RETURN ADDRESS=642 Townhall Centre Drive||Foothill Ranch|CA|918610:PAPEROUT COUNT=0:CLOSING=true:DOCTYPE=Closing Disclosure:BUSINESS CHANNEL=Retail:ATTENTION TO=Merrick, John A:LOANTYPE=VA:TEST=false:ParentTrackingID=25535832\n";
        storeData(strList);
        printAll();
        System.out.println();
        System.out.println("Print value by key");
        System.out.println(getValue("BORROWER NAME"));
    }

    public static void storeData(String strList) {
        try {
            for (String str : strList.split(":")) {
                String[] entryArray = str.split("=");
                map.put(entryArray[0], entryArray.length==2?entryArray[1]:"");

            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void printAll(){
        map.forEach((key,value)-> System.out.println(key+" : "+value));
    }

    public static String getValue(String key){
        return map.get(key);
    }

}
