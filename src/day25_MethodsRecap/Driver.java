package day25_MethodsRecap;

public class Driver {
    /*
    method declaration:
    Access-modifiers Specifier  return-Type  MethodName(paramater){
             statement;
     */
    public static void main(String[] args) {
        //getDriver1();//argument is menatory
        String str=getDriver1("Cybertek");
        //String str2= getDriver2("ChroMe");
        //System.out.println(str2);
        System.out.println(str);
        String str3=getDriver3("FireFox");
        System.out.println(str3);
    }

    public static String getDriver1(String browserName) {
        String result="";

        switch (browserName.toLowerCase()){//"ChromE".tolowercase()==>chrome
            case "Chrome": result="Chrome Driver";
                           break;
            case"firefox": result="Firefox Driver";
                           break;
            case "Safari": result="Safari Driver";
                           break;
            case "opera": result="Opera Driver";
                          break;
            case "edge": result="Edge Driver";
                         break;
            default: result= "Invalid Driver";

        }

        return result;

    }

    public static void getDriver2(String browserName) {
       browserName= browserName.toLowerCase();//ignore the low sensitivity
        String result="";
        if (browserName.equals("chrome")){
            result="Chrome Driver";
        }else if (browserName.equals("Firefox")){
            result="Firefox Driver";
        }else if (browserName.equals("Safari")){
            result= "Safari Driver";
        }else if (browserName.equals("edge")){
            result= "Edge Driver";
        }else if (browserName.equals("opera")){
            result= "Opera Driver";
        }else {
            result="Invalid Driver";
        }


    }

    public static String getDriver3(String browserName) {
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome")) ? "Chrome Driver" : (browserName.equals("firefox ")) ? "Firefox Driver"
                : (browserName.equals("safari")) ? "Safari Driver" : (browserName.equals("edge")) ? "Edge Driver"
                : (browserName.equals("opera")) ? "Opera Driver" : "Invalid";
        return result;
    }

    }


