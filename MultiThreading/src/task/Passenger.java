package task;

public class Passenger {

	private int ticketId;
	private String passengerName;
	private String source;
	private String destination;
	private int km;
	
	public Passenger(int ticketId, String passengerName, String source, String destination, int km) {
		//super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.km = km;
	}

	public int getTicketId() {
		return ticketId;
	}





	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}





	public String getPassengerName() {
		return passengerName;
	}





	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}





	public String getSource() {
		return source;
	}





	public void setSource(String source) {
		this.source = source;
	}





	public String getDestination() {
		return destination;
	}





	public void setDestination(String destination) {
		this.destination = destination;
	}





	public int getKm() {
		return km;
	}





	public void setKm(int km) {
		this.km = km;
	}





	@Override
	public String toString() {
		return "Employee [ticketId=" + ticketId + ", passengerName=" + passengerName + ", source=" + source
				+ ", destination=" + destination + ", km=" + km + "]";
	}

	 
	
	
}
