public class LogMessage {

	private String machineID;
	private String description;

	public LogMessage(String message) {
		int index = message.indexOf(":");
		machineID = message.substring(0, index);
		description = message.substring(index + 1);
	}

	public boolean containsWord(String message) {
		
		if (message.equals(description)) {
			return true;
		} 
		
		else if (description.substring(0, (message.length() + 2) - 1).equals(message + " ")|| description.substring((message.length() + 2) - 1).equals(" " + message)) {
			return true;
		}

		else {
			for (int i = 0; i < description.length() - (message.length() + 2); i++) {
				if (description.substring(i, i + (message.length() + 2)).equals(" " + message + " "))
					return true;
			}
		}
		
		return false;
	}

	public String getMachineId() {
		return machineID;
	}

	public String getDescrption() {
		return description;
	}

}