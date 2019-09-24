package sample1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Training {

    public static void main(String[] args) {

        // 引数チェック
        if (!checkArgs(args)) {
            return;
        }

        // 単語情報ファイル存在チェック
        if (!existDictionaryDataFile(args[0])) {
            return;
        }

        // 単語情報読み込み
        List<String> dictionaryWords = readDictionaryData(args[0]);

        // 単語情報出力
        for (String dictionaryWord: dictionaryWords) {
            System.out.println(dictionaryWord);
        }
    }

    // 引数チェック
    // 引数が1つ以外の場合、エラーメッセージを表示し、チェックエラーとする
    private static boolean checkArgs(String[] args) {

        // 単語情報ファイルが指定されているか確認する
        if (args.length != 1) {
            System.out.println("単語情報ファイルを指定して下さい。");
            return false;
        }
        return true;
    }

    // 単語情報ファイル存在チェック
    // 単語情報ファイルが存在しない場合、チェックエラーとする
    private static boolean existDictionaryDataFile(String dictionaryDataFilePath) {

        // ファイル情報取得
        File dictionaryDataFile = new File(dictionaryDataFilePath);

        // 単語情報ファイルが存在するか確認する
        if (!dictionaryDataFile.exists()) {
            System.out.println("単語情報ファイルが存在しません");
            System.out.println("指定ファイル：" + dictionaryDataFilePath);
            return false;
        }
        return true;
    }

    // 指定されたファイルパスのファイルを読み込み、1行1要素としてListで返却する
    // ファイルの読み込みに失敗した場合は空のリストを返却する
    private static List<String> readDictionaryData(String dictionaryDataFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryDataFilePath,
                StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("ファイルの読み込みに失敗しました:" + dictionaryDataFilePath);
        }
        return Collections.emptyList();
    }
}
