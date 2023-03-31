package notepad.note.notas.notes.notizen.util.recyclerView;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

public class SnappingLinearLayoutManager extends LinearLayoutManager {

    private class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public PointF a(int i) {
            return SnappingLinearLayoutManager.this.a(i);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.j
        public int j() {
            return -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.c(i);
        b(aVar);
    }
}
