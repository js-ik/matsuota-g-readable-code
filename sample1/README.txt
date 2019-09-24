・機能概要
標準出力に「上手」と表示されます

・実行方法
＜eclipseの場合＞
Training.java を右クリック　- [Run As] - [Java Application] 

＜IntelliJの場合＞
実行できる状態にするまでに一度だけ以下の対応を行う必要がある。

1. プログラムのソースを配置したディレクトリにソースをIntelliJに認識させる
   * ソースを配置したディレクトリを右クリック（例: src）
   * [Mark Directory as] → [Sources Root]を選択（ディレクトリの色が青色に変わる）
2. クラスファイルの出力先をプロジェクトに設定する
   * [File] → [Project Structure...]をクリック
   * [Project Compiler output]の欄に出力先ディレクトリを指定する


以降は以下の操作だけで実行が可能

1. プログラムを実行
   * sample1.Training.javaを開く
   * [Run] → [Edit Configurations]で実行設定を開き、プログラム引数に辞書ファイルのパスを指定する
   * main関数を実行


＜コマンドラインの場合＞
TODO:要調査　実行方法を調べて記載する

