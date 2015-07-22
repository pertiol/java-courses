package com.pertiol.servlets;


import com.lessons.Client;
import com.lessons.Dog;
import com.lessons.Cat;
import com.lessons.Clinic;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TODO: comment
 * @author pertiol
 *
 */
public class ClinicServlet extends HttpServlet {

	final List<Client> clients = new CopyOnWriteArrayList<Client>();


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append(
				"<!DOCTYPE html>" +
				"<html>" +
				"<head>" +
				"     <title>Clinic Pets</title>" +
				"</head>" +
				"<body>" +
				"     <form action='"+req.getContextPath()+"/' method='post'>" +
				"         Client name : <input type='text' name='name'>"+
                "         Pet name : <input type='text' name='petName'>"+
                "         <input type='submit' value='Submit'>"+
				"     <form> <br>"+
                "     <form action='"+req.getContextPath()+"/' method='post'>" +
                "         Search by client name : <input type='text' name='searchName'>"+
                "         Search by pet name : <input type='text' name='searchPetName'>"+
                "         <input type='submit' value='Submit'>"+
                "     <form>"+
				this.viewPets() +
				"</body>" +
				"</html>"
		);
		writer.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.clients.add(new Client (0, req.getParameter("name"), (new Dog(req.getParameter("petName")))));
        this.searchName = req.getParameter("searchName");
        this.searchPetName = req.getParameter("searchPetName");
		doGet(req, resp);
	}

    private String searchName = "";
    private String searchPetName = "";
	private String viewPets() {
		StringBuilder sb = new StringBuilder();
		sb.append("<p>Clients' pets</p>");
		sb.append("<table style='border : 1px solid black'>");
        List<Client> clients1 = this.clients;
        if (!searchName.isEmpty() || !searchPetName.isEmpty()) {
            for (Client client : clients1) {
                if (client.getPetName().equals(searchPetName)) {
                    sb.append("<tr><td style='border : 1px solid black; width: 50px'>").append(client.getName()).append("</td>");
                    sb.append("<td style='border : 1px solid black; width: 50px'>").append(client.getPetName()).append("</td></tr>");
                } else if (client.getName().equals(searchName)) {
                    sb.append("<tr><td style='border : 1px solid black; width: 50px'>").append(client.getName()).append("</td>");
                    sb.append("<td style='border : 1px solid black; width: 50px'>").append(client.getPetName()).append("</td></tr>");
                }
            }
        } else
            for (int i = 0; i < clients1.size(); i++) {
                Client client = clients1.get(i);
                sb.append("<tr><td style='border : 1px solid black; width: 50px'>").append(client.getName()).append("</td>");
                sb.append("<td style='border : 1px solid black; width: 50px'>").append(client.getPetName()).append("</td></tr>");
            }
            sb.append("</table>");
		return sb.toString();
	}
}
