.class Landroidx/appcompat/widget/w$a;
.super Landroidx/appcompat/widget/h0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/appcompat/widget/w$e;

.field final synthetic l:Landroidx/appcompat/widget/w;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/w;Landroid/view/View;Landroidx/appcompat/widget/w$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/w$a;->l:Landroidx/appcompat/widget/w;

    iput-object p3, p0, Landroidx/appcompat/widget/w$a;->k:Landroidx/appcompat/widget/w$e;

    invoke-direct {p0, p2}, Landroidx/appcompat/widget/h0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/appcompat/view/menu/p;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/w$a;->k:Landroidx/appcompat/widget/w$e;

    return-object v0
.end method

.method public b()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/widget/w$a;->l:Landroidx/appcompat/widget/w;

    invoke-virtual {v0}, Landroidx/appcompat/widget/w;->getInternalPopup()Landroidx/appcompat/widget/w$g;

    move-result-object v0

    invoke-interface {v0}, Landroidx/appcompat/widget/w$g;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/w$a;->l:Landroidx/appcompat/widget/w;

    invoke-virtual {v0}, Landroidx/appcompat/widget/w;->a()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
