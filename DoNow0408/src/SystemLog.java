import java.util.ArrayList;
import java.util.List;

public class SystemLog {

	private List<LogMessage> messageList;

	public List<LogMessage> removeMessages(String keyword) {
		
		ArrayList<LogMessage> messagesRemoved = new ArrayList<LogMessage>();

		for (int i = 0; i < messageList.size(); i++) {
			
			if (messageList.get(i).containsWord(keyword)) {
				messagesRemoved.add(messageList.remove(i));
				i -= 1;
			}
		}

		return messagesRemoved;
	}

}