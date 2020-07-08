import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemLog {
	private List<LogMessage> messageList = new ArrayList<LogMessage>();

	public SystemLog(List<LogMessage> list) {
		messageList = list;
	}

	public List<LogMessage> removeMessages(String Keyword) {
		List<LogMessage> message = new ArrayList<LogMessage>();

		for (int i = 0; i < messageList.size(); i++) {
			
			if (messageList.get(i).containsWord(Keyword)) {
				message.add(messageList.get(i));
			}
			
			messageList.remove(i);
			i--;
		}
		return message;
	}

	public static void main(String[] args) {
		List<LogMessage> messageList = new ArrayList<LogMessage>();

		messageList.add(new LogMessage("Webserever:disk Offline"));
		messageList.add(new LogMessage("SERVER1:file not found"));
		messageList.add(new LogMessage("SERVER2:read error on disk DSK1"));
		messageList.add(new LogMessage("SERVER1:write error on disk DSK2"));
		messageList.add(new LogMessage("Webserever:error on /dev/disk"));

		SystemLog a = new SystemLog(messageList);
		for (LogMessage i : a.removeMessages("disk")) {
			System.out.println(i.getMachineId() + ":" + i.getDescrption());
		}
	}

}
