.class Lnotepad/note/notas/notes/notizen/main/MainActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/main/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnotepad/note/notas/notes/notizen/main/MainActivity;


# direct methods
.method constructor <init>(Lnotepad/note/notas/notes/notizen/main/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$a;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$a;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-static {p2}, Lb/a/a/a/a$a;->a(Landroid/os/IBinder;)Lb/a/a/a/a;

    move-result-object p2

    iput-object p2, p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->C:Lb/a/a/a/a;

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$a;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    invoke-static {p1}, Lnotepad/note/notas/notes/notizen/main/MainActivity;->a(Lnotepad/note/notas/notes/notizen/main/MainActivity;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/main/MainActivity$a;->a:Lnotepad/note/notas/notes/notizen/main/MainActivity;

    const/4 v0, 0x0

    iput-object v0, p1, Lnotepad/note/notas/notes/notizen/main/MainActivity;->C:Lb/a/a/a/a;

    return-void
.end method
