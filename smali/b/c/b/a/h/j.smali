.class final Lb/c/b/a/h/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/b/a/h/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lb/c/b/a/h/r<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lb/c/b/a/h/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/a<",
            "TTResult;TTContinuationResult;>;"
        }
    .end annotation
.end field

.field private final c:Lb/c/b/a/h/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/u<",
            "TTContinuationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lb/c/b/a/h/a;Lb/c/b/a/h/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lb/c/b/a/h/a<",
            "TTResult;TTContinuationResult;>;",
            "Lb/c/b/a/h/u<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/c/b/a/h/j;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lb/c/b/a/h/j;->b:Lb/c/b/a/h/a;

    iput-object p3, p0, Lb/c/b/a/h/j;->c:Lb/c/b/a/h/u;

    return-void
.end method

.method static synthetic a(Lb/c/b/a/h/j;)Lb/c/b/a/h/u;
    .locals 0

    iget-object p0, p0, Lb/c/b/a/h/j;->c:Lb/c/b/a/h/u;

    return-object p0
.end method

.method static synthetic b(Lb/c/b/a/h/j;)Lb/c/b/a/h/a;
    .locals 0

    iget-object p0, p0, Lb/c/b/a/h/j;->b:Lb/c/b/a/h/a;

    return-object p0
.end method


# virtual methods
.method public final a(Lb/c/b/a/h/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/c/b/a/h/f<",
            "TTResult;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/j;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lb/c/b/a/h/k;

    invoke-direct {v1, p0, p1}, Lb/c/b/a/h/k;-><init>(Lb/c/b/a/h/j;Lb/c/b/a/h/f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
