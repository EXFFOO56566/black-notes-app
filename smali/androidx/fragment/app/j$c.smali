.class Landroidx/fragment/app/j$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/j;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/j$g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroidx/fragment/app/Fragment;

.field final synthetic c:Landroidx/fragment/app/j;


# direct methods
.method constructor <init>(Landroidx/fragment/app/j;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/j$c;->c:Landroidx/fragment/app/j;

    iput-object p2, p0, Landroidx/fragment/app/j$c;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/j$c;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/j$c;->a:Landroid/view/ViewGroup;

    new-instance v0, Landroidx/fragment/app/j$c$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/j$c$a;-><init>(Landroidx/fragment/app/j$c;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
