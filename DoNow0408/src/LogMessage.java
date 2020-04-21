public class LogMessage {

	private String machineId;
	private String description;

	public LogMessage(String message) {
		
		machineId = message.substring(0, message.indexOf(":"));
		description = message.substring(message.indexOf(":") + 1);

	}
	
	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}

	public boolean containsWord(String keyword) {
		
		int indexKeyword = description.indexOf(keyword);

		while (indexKeyword != -1) {
			
			int left = indexKeyword - 1;
			int index = indexKeyword + keyword.length();
			
			if ((left == -1 || description.substring(left, left + 1).equals(" "))
					&& (index == description.length() || description.substring(index, index + 1).equals(" ")))
				return true;

			indexKeyword = description.indexOf(keyword, indexKeyword + 1);
		}

		return false;
	}



}