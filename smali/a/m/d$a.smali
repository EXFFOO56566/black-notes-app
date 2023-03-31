.class La/m/d$a;
.super La/m/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/m/d;->a(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;


# direct methods
.method constructor <init>(La/m/d;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, La/m/d$a;->a:Landroid/view/View;

    invoke-direct {p0}, La/m/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(La/m/m;)V
    .locals 2

    iget-object v0, p0, La/m/d$a;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, La/m/c0;->a(Landroid/view/View;F)V

    iget-object v0, p0, La/m/d$a;->a:Landroid/view/View;

    invoke-static {v0}, La/m/c0;->a(Landroid/view/View;)V

    invoke-virtual {p1, p0}, La/m/m;->b(La/m/m$f;)La/m/m;

    return-void
.end method
