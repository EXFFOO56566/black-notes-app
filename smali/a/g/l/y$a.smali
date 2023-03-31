.class La/g/l/y$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/l/y;->a(Landroid/view/View;La/g/l/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/g/l/z;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(La/g/l/y;La/g/l/z;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, La/g/l/y$a;->a:La/g/l/z;

    iput-object p3, p0, La/g/l/y$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/g/l/y$a;->a:La/g/l/z;

    iget-object v0, p0, La/g/l/y$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/g/l/z;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/g/l/y$a;->a:La/g/l/z;

    iget-object v0, p0, La/g/l/y$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/g/l/z;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/g/l/y$a;->a:La/g/l/z;

    iget-object v0, p0, La/g/l/y$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/g/l/z;->c(Landroid/view/View;)V

    return-void
.end method
