import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        int cnt = 0;
        String password = myScanner.nextLine();
        String totalRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.*(.)\\1\\1).{6,20}";
        Pattern totalPattern = Pattern.compile(totalRegex);
        Matcher totalmatcher = totalPattern.matcher(password);
        if(totalmatcher.find())
            System.out.println(0);
        else
        {
            if(password.length() >= 6 && password.length() <= 20)
            {
                String partialRegex = "(?=.*[a-z])";
                Pattern partialPattern = Pattern.compile(partialRegex);
                Matcher partialMatcher = partialPattern.matcher(password);
                if(!partialMatcher.find())
                {
                    cnt++;
                    if(password.length() == 20)
                    {
                        cnt++;
                        int digit = 0, upperLetter = 0;
                        for(int i = 0; i < password.length() && digit < 2 && upperLetter < 2; i++)
                        {
                            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                                upperLetter++;
                            }
                            else{
                                if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                                    digit++;
                                }
                            }
                        }
                        if(upperLetter == 2)
                        {
                            for(int i = 0; i < password.length(); i++){
                                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                                    password = password.substring(0, i) + 'a' + password.substring(i + 1);
                                    break;
                                }
                            }
                        }
                        else
                        {
                            for(int i = 0; i < password.length(); i++){
                                if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                                    password = password.substring(0, i) + 'a' + password.substring(i + 1);
                                    break;
                                }
                            }
                        }
                    }
                    else{
                        password = password + 'a';
                    }
                }
                partialRegex = "(?=.*[A-Z])";
                partialPattern = Pattern.compile(partialRegex);
                partialMatcher = partialPattern.matcher(password);
                if(!partialMatcher.find())
                {
                    cnt++;
                    if(password.length() == 20)
                    {
                        cnt++;
                        int digit = 0, lowerLetter = 0;
                        for(int i = 0; i < password.length() && digit < 2 && lowerLetter < 2; i++)
                        {
                            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'a') {
                                lowerLetter++;
                            }
                            else{
                                if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                                    digit++;
                                }
                            }
                        }
                        if(lowerLetter == 2)
                        {
                            for(int i = 0; i < password.length(); i++){
                                if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                                    password = password.substring(0, i) + 'A' + password.substring(i + 1);
                                    break;
                                }
                            }
                        }
                        else
                        {
                            for(int i = 0; i < password.length(); i++){
                                if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                                    password = password.substring(0, i) + 'A' + password.substring(i + 1);
                                    break;
                                }
                            }
                        }
                    }
                    else{
                        password = password + 'A';
                    }
                }
                partialRegex = "(?=.*\\d)";
                partialPattern = Pattern.compile(partialRegex);
                partialMatcher = partialPattern.matcher(password);
                if(!partialMatcher.find())
                {
                    cnt++;
                    if(password.length() == 20)
                    {
                        cnt++;
                        int lowerLetter = 0, upperLetter = 0;
                        for(int i = 0; i < password.length() && lowerLetter < 2 && upperLetter < 2; i++)
                        {
                            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                                upperLetter++;
                            }
                            else{
                                if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                                    lowerLetter++;
                                }
                            }
                        }
                        if(upperLetter == 2)
                        {
                            for(int i = 0; i < password.length(); i++){
                                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                                    password = password.substring(0, i) + '0' + password.substring(i + 1);
                                    break;
                                }
                            }
                        }
                        else
                        {
                            for(int i = 0; i < password.length(); i++){
                                if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                                    password = password.substring(0, i) + '0' + password.substring(i + 1);
                                    break;
                                }
                            }
                        }
                    }
                    else{
                        password = password + '0';
                    }
                }

                partialRegex = "^(?!.*(.)\\1{2,}).+$";
                partialPattern = Pattern.compile(partialRegex);
                partialMatcher = partialPattern.matcher(password);
                while(!partialMatcher.find())
                {
                    String temp;
                    for(int i = 0; i < password.length() - 2; i++)
                    {
                        temp = password.substring(i, i + 3);
                        partialMatcher = partialPattern.matcher(temp);
                        if(!partialMatcher.find())
                        {
                            cnt++;
                            if(i == 0)
                                password = password.substring(i + 1);
                            else
                                password = password.substring(0, i) + password.substring(i + 1);
                        }

                    }
                    partialMatcher = partialPattern.matcher(password);
                }

            }
            System.out.println(cnt);
            System.out.println(password);
        }
    }
}
