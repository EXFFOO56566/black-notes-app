.class final Lb/c/b/b/p/a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/b/b/p/a;->a(Lb/c/b/b/p/d;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/c/b/b/p/d;


# direct methods
.method constructor <init>(Lb/c/b/b/p/d;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/b/p/a$a;->a:Lb/c/b/b/p/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lb/c/b/b/p/a$a;->a:Lb/c/b/b/p/d;

    invoke-interface {p1}, Lb/c/b/b/p/d;->a()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lb/c/b/b/p/a$a;->a:Lb/c/b/b/p/d;

    invoke-interface {p1}, Lb/c/b/b/p/d;->b()V

    return-void
.end method
