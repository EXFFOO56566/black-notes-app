.class Landroidx/appcompat/widget/w$e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/w$e;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/appcompat/widget/w$e;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/w$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/w$e$b;->b:Landroidx/appcompat/widget/w$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->b:Landroidx/appcompat/widget/w$e;

    iget-object v1, v0, Landroidx/appcompat/widget/w$e;->N:Landroidx/appcompat/widget/w;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/w$e;->b(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->b:Landroidx/appcompat/widget/w$e;

    invoke-virtual {v0}, Landroidx/appcompat/widget/j0;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->b:Landroidx/appcompat/widget/w$e;

    invoke-virtual {v0}, Landroidx/appcompat/widget/w$e;->j()V

    iget-object v0, p0, Landroidx/appcompat/widget/w$e$b;->b:Landroidx/appcompat/widget/w$e;

    invoke-static {v0}, Landroidx/appcompat/widget/w$e;->a(Landroidx/appcompat/widget/w$e;)V

    :goto_0
    return-void
.end method
