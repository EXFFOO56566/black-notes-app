.class public final La/g/l/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/g/l/c$c;,
        La/g/l/c$b;,
        La/g/l/c$a;
    }
.end annotation


# instance fields
.field private final a:La/g/l/c$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, La/g/l/c;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-le v0, v1, :cond_0

    new-instance v0, La/g/l/c$c;

    invoke-direct {v0, p1, p2, p3}, La/g/l/c$c;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    goto :goto_0

    :cond_0
    new-instance v0, La/g/l/c$b;

    invoke-direct {v0, p1, p2, p3}, La/g/l/c$b;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V

    :goto_0
    iput-object v0, p0, La/g/l/c;->a:La/g/l/c$a;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, La/g/l/c;->a:La/g/l/c$a;

    invoke-interface {v0, p1}, La/g/l/c$a;->a(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
