//Parse Data from a URL
//• Description: Given a URL string, write a program to extract its components: the protocol,
//the domain, and the path.
//• Hint: Use indexOf("://") to find the end of the protocol. Use indexOf("/", startIndex) to find
//the end of the domain. substring() is the main tool here.
//• Example:
//o Input: "https://dtu.edu.vn/portals/0/home.aspx"
//o Output:
//o Protocol: https
//o Domain: dtu.edu.vn
//o Path: /portals/0/home.aspx

package Lec8_exercise;
import java.util.Scanner;
/**
 *
 * @author THIEN QUOC AN
 */
public class Ex5_parse_data_from_a_URL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter a URL: ");
            String url = sc.nextLine();
            
            int protocolEnd = url.indexOf("://");
            String protocol = url.substring(0,protocolEnd);
            
            int domainStart = protocolEnd +3;
            int pathStart = url.indexOf("/", domainStart);
            
            String domain;
            String path;
            
            if (pathStart == -1){
            domain = url.substring(domainStart);
            path = "";
        }else{
                domain = url.substring(domainStart, pathStart);
                path = url.substring(pathStart);
            }
            System.out.println("Protocol: " + protocol);
            System.out.println("Domain: " + domain);
            System.out.println("Path: " + path);
        }
    }
                 