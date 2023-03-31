.class La/m/o$a$a;
.super La/m/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/m/o$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/e/a;

.field final synthetic b:La/m/o$a;


# direct methods
.method constructor <init>(La/m/o$a;La/e/a;)V
    .locals 0

    iput-object p1, p0, La/m/o$a$a;->b:La/m/o$a;

    iput-object p2, p0, La/m/o$a$a;->a:La/e/a;

    invoke-direct {p0}, La/m/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(La/m/m;)V
    .locals 2

    iget-object v0, p0, La/m/o$a$a;->a:La/e/a;

    iget-object v1, p0, La/m/o$a$a;->b:La/m/o$a;

    iget-object v1, v1, La/m/o$a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, La/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, La/m/m;->b(La/m/m$f;)La/m/m;

    return-void
.end method
