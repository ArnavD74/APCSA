import java.util.ArrayList;

public class MusicDownloads {

	private String title;

	private static ArrayList<DownloadInfo> downloadList;

	public MusicDownloads() {
		downloadList = new ArrayList<DownloadInfo>();
	}

	public DownloadInfo getDownloadInfo(String title) {

		this.title = title;

		for (int i = 0; i < downloadList.size(); i++) {

			if (title.equals(downloadList.get(i).getTitle())) {
				return downloadList.get(i);
			}
		}

		return null;
	}

	public void updateDownloads(ArrayList<String> titles) {

		int counter = 0;

		for (int i = 0; i < titles.size(); i++) {

			for (String title : titles) {

				DownloadInfo info = getDownloadInfo(title);

				if (info == null) {

					downloadList.add(new DownloadInfo(title));

				}

				else {
					info.incrementTimesDownloaded();
				}
			}
		}
	}

	public static void main(String[] args) {

		DownloadInfo d = new DownloadInfo("Funky Cold Medina");
		System.out.println(d);

		DownloadInfo x = new DownloadInfo("Stay");
		System.out.println(x);

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i < 6; i++)
			list.add("Hey Jude");
		for (int i = 1; i < 4; i++)
			list.add("Soul Sister");
		for (int i = 1; i < 11; i++)
			list.add("Aqualung");

		MusicDownloads md = new MusicDownloads();
		md.updateDownloads(list);
		System.out.println(md.getDownloadInfo("Stay"));
		System.out.println(md);

		list = new ArrayList<String>();
		list.add("Lights");
		list.add("Aqualung");
		list.add("Soul Sister");
		list.add("Go Now");
		list.add("Lights");
		list.add("Soul Sister");

		md.updateDownloads(list);
		System.out.println(md.getDownloadInfo("Aqualung"));
		System.out.println(md);

	}

}
