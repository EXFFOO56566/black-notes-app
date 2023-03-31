.class public Lnotepad/note/notas/notes/notizen/checklist/guide/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c:Z

    iput-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->d:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->e:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->a:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->b:Z

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->e:I

    return v0
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->d:Z

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->b:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lnotepad/note/notas/notes/notizen/checklist/guide/a;->c:Z

    return v0
.end method
