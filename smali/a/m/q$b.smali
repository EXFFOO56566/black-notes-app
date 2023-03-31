.class La/m/q$b;
.super La/m/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/m/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:La/m/q;


# direct methods
.method constructor <init>(La/m/q;)V
    .locals 0

    invoke-direct {p0}, La/m/n;-><init>()V

    iput-object p1, p0, La/m/q$b;->a:La/m/q;

    return-void
.end method


# virtual methods
.method public a(La/m/m;)V
    .locals 1

    iget-object p1, p0, La/m/q$b;->a:La/m/q;

    iget-boolean v0, p1, La/m/q;->N:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, La/m/m;->s()V

    iget-object p1, p0, La/m/q$b;->a:La/m/q;

    const/4 v0, 0x1

    iput-boolean v0, p1, La/m/q;->N:Z

    :cond_0
    return-void
.end method

.method public e(La/m/m;)V
    .locals 2

    iget-object v0, p0, La/m/q$b;->a:La/m/q;

    iget v1, v0, La/m/q;->M:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, La/m/q;->M:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, La/m/q;->N:Z

    invoke-virtual {v0}, La/m/m;->c()V

    :cond_0
    invoke-virtual {p1, p0}, La/m/m;->b(La/m/m$f;)La/m/m;

    return-void
.end method
