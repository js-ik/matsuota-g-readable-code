package sample1;

public class Training {

	public static void main(String[] args) {
		
		// 引数チェック
		if (!checkArgs(args)) {
			return;
		}
		
		// 入力ファイル存在チェック
		
		// 単語情報読み込み
		
		// 単語情報出力
		
		System.out.println("上手");

	}

	// 引数チェック
	// 引数が1つ以外の場合、エラーメッセージを表示し、チェックエラーとする
	private static boolean checkArgs(String[] args) {

		// 単語情報ファイルが指定されているか確認する
		if (args.length !=1) {
			System.out.println("単語情報ファイルを指定して下さい。");
			return false;
		}
		return true;
	}
	
	
	
}
