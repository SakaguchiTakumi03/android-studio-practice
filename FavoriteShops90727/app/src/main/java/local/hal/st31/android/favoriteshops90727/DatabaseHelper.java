package local.hal.st31.android.favoriteshops90727;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    /**
     * データベースファイル名の定数フィールド。
     */
    private static final String DATABASE_NAME = "favoriteShop.db";
//    private static final String DATABASE_NAME = "memopad.db";
    /**
     * バージョン情報の定数フィールド。
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * コンストラクタ。
     *
     * @param context コンテキスト。
     */
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuffer sb = new StringBuffer();
        sb.append("CREATE TABLE shops (");
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT,");
        sb.append("name TEXT NOT NULL,");
        sb.append("tel TEXT,");
        sb.append("url TEXT,");
        sb.append("note TEXT");
        sb.append(");");
        String sql = sb.toString();

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


}
