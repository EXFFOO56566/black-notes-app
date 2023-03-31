.class La/i/b/a$c;
.super La/g/l/d0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/i/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:La/i/b/a;


# direct methods
.method constructor <init>(La/i/b/a;)V
    .locals 0

    iput-object p1, p0, La/i/b/a$c;->b:La/i/b/a;

    invoke-direct {p0}, La/g/l/d0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)La/g/l/d0/c;
    .locals 1

    iget-object v0, p0, La/i/b/a$c;->b:La/i/b/a;

    invoke-virtual {v0, p1}, La/i/b/a;->b(I)La/g/l/d0/c;

    move-result-object p1

    invoke-static {p1}, La/g/l/d0/c;->a(La/g/l/d0/c;)La/g/l/d0/c;

    move-result-object p1

    return-object p1
.end method

.method public a(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, La/i/b/a$c;->b:La/i/b/a;

    invoke-virtual {v0, p1, p2, p3}, La/i/b/a;->b(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public b(I)La/g/l/d0/c;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, La/i/b/a$c;->b:La/i/b/a;

    iget p1, p1, La/i/b/a;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, La/i/b/a$c;->b:La/i/b/a;

    iget p1, p1, La/i/b/a;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, La/i/b/a$c;->a(I)La/g/l/d0/c;

    move-result-object p1

    return-object p1
.end method
