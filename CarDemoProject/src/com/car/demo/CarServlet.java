package com.car.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Car car1 = new Car();
		car1.setName("Toyota Aqua");
		car1.setYear("2014");
		car1.setImage("https://auto.ndtvimg.com/car-images/medium/maruti-suzuki/alto-800/maruti-suzuki-alto-800.jpg");
		
		Car car2 = new Car();
		car2.setName("BMW A8");
		car2.setYear("2016");
		car2.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Hands-free_Driving.jpg/220px-Hands-free_Driving.jpg");
		
		Car car3 = new Car();
		car3.setName("Mazda 3");
		car3.setYear("2017");
		car3.setImage("https://auto.ndtvimg.com/car-images/medium/jeep/compass/jeep-compass.jpg");
		
		Car[] carModels = new Car[] {car1, car2, car3};
		
		request.setAttribute("cars", carModels);
		
		request.getRequestDispatcher("car.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
