.class Landroidx/recyclerview/widget/f$h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/f$h;-><init>(Landroidx/recyclerview/widget/RecyclerView$d0;IIFFFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/f$h;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/f$h;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/f$h$a;->a:Landroidx/recyclerview/widget/f$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/f$h$a;->a:Landroidx/recyclerview/widget/f$h;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/f$h;->a(F)V

    return-void
.end method
