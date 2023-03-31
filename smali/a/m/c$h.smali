.class La/m/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/m/c;->a(Landroid/view/ViewGroup;La/m/s;La/m/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/m/c$k;

.field private mViewBounds:La/m/c$k;


# direct methods
.method constructor <init>(La/m/c;La/m/c$k;)V
    .locals 0

    iput-object p2, p0, La/m/c$h;->a:La/m/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iget-object p1, p0, La/m/c$h;->a:La/m/c$k;

    iput-object p1, p0, La/m/c$h;->mViewBounds:La/m/c$k;

    return-void
.end method
