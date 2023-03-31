package notepad.note.notas.notes.notizen.setting;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.github.ajalt.reprint.module.spass.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import notepad.note.notas.notes.notizen.main.MainActivity;
import notepad.note.notas.notes.notizen.util.a;
import notepad.note.notas.notes.notizen.util.b;

public class BackUpRestoreActivity extends c {
    private a s;

    private void a(Uri uri) {
        Intent intent;
        OutputStream outputStream = null;
        try {
            OutputStream openOutputStream = getContentResolver().openOutputStream(uri);
            if (openOutputStream != null) {
                openOutputStream.write(b.a(getDatabasePath("BlackNoteDB").getPath()));
                Toast.makeText(this, "Success", 0).show();
            }
            if (openOutputStream != null) {
                try {
                    openOutputStream.flush();
                    openOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            finish();
            intent = new Intent(this, MainActivity.class);
        } catch (IOException e2) {
            Toast.makeText(this, "Failed..", 0).show();
            e2.printStackTrace();
            if (0 != 0) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            finish();
            intent = new Intent(this, MainActivity.class);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            finish();
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(0, 0);
            throw th;
        }
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    private String b(Uri uri) {
        String str;
        Cursor query;
        if (!uri.getScheme().equals("content") || (query = getContentResolver().query(uri, null, null, null, null)) == null || !query.moveToFirst()) {
            str = null;
        } else {
            str = query.getString(query.getColumnIndex("_display_name"));
            query.close();
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    private void c(Uri uri) {
        try {
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(getDatabasePath("BlackNoteDB").getPath()));
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        int read = openInputStream.read(bArr, 0, 1024);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            Toast.makeText(this, "Success", 0).show();
                            finish();
                            startActivity(new Intent(this, MainActivity.class));
                            overridePendingTransition(0, 0);
                            return;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        Toast.makeText(this, "Failed..", 0).show();
                        o();
                        return;
                    }
                }
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    private void o() {
        finish();
        overridePendingTransition(0, R.anim.activity_fade_out);
    }

    private void p() {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.setType("application/x-sqlite3");
        intent.putExtra("android.intent.extra.TITLE", "BlackNoteDB.db");
        intent.addCategory("android.intent.category.OPENABLE");
        startActivityForResult(intent, 1);
    }

    private void q() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        startActivityForResult(intent, 2);
    }

    public void btnClick(View view) {
        if (this.s.a()) {
            if (view.getId() == R.id.btnBackUp) {
                p();
            } else if (view.getId() == R.id.btnRestore) {
                q();
            } else if (view.getId() == R.id.layout) {
                o();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && (data = intent.getData()) != null) {
            if (i == 2) {
                if (b(data).contains("BlackNoteDB")) {
                    c(data);
                } else {
                    Toast.makeText(this, "The file name should include BlackNoteDB.", 1).show();
                }
            } else if (i == 1) {
                a(data);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        o();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_back_up_restore);
        notepad.note.notas.notes.notizen.util.c.a(this, "#000000");
        this.s = new a();
    }
}
