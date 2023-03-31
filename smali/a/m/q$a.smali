.class La/m/q$a;
.super La/m/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/m/q;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/m/m;


# direct methods
.method constructor <init>(La/m/q;La/m/m;)V
    .locals 0

    iput-object p2, p0, La/m/q$a;->a:La/m/m;

    invoke-direct {p0}, La/m/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(La/m/m;)V
    .locals 1

    iget-object v0, p0, La/m/q$a;->a:La/m/m;

    invoke-virtual {v0}, La/m/m;->r()V

    invoke-virtual {p1, p0}, La/m/m;->b(La/m/m$f;)La/m/m;

    return-void
.end method
