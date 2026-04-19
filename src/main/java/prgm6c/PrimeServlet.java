//6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.
package prgm6c;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("num");

        int number;

        try {
            number = Integer.parseInt(input);

            if (number <= 1) {
                // Invalid number → send error code
                response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                        "Invalid number! Enter number greater than 1.");
                return;
            }

        } catch (NumberFormatException e) {
            // Invalid input (not a number)
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "Invalid input! Please enter a valid integer.");
            return;
        }

        // Check prime
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Display result
        out.println("<html><body>");

        if (isPrime) {
            out.println("<h2>" + number + " is a Prime Number</h2>");
        } else {
            out.println("<h2>" + number + " is NOT a Prime Number</h2>");
        }

        out.println("</body></html>");
    }
}