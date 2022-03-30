package dto;

public class DB {

	private static DB obj;

	private DB() {
	}

	public static DB getConn() {
		if (obj == null)
			obj = new DB();

		return obj;
	}
}
