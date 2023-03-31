.class public Lb/c/b/a/h/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lb/c/b/a/h/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/c/b/a/h/u<",
            "TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb/c/b/a/h/u;

    invoke-direct {v0}, Lb/c/b/a/h/u;-><init>()V

    iput-object v0, p0, Lb/c/b/a/h/g;->a:Lb/c/b/a/h/u;

    return-void
.end method


# virtual methods
.method public a()Lb/c/b/a/h/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/c/b/a/h/f<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/g;->a:Lb/c/b/a/h/u;

    return-object v0
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lb/c/b/a/h/g;->a:Lb/c/b/a/h/u;

    invoke-virtual {v0, p1}, Lb/c/b/a/h/u;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/g;->a:Lb/c/b/a/h/u;

    invoke-virtual {v0, p1}, Lb/c/b/a/h/u;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lb/c/b/a/h/g;->a:Lb/c/b/a/h/u;

    invoke-virtual {v0, p1}, Lb/c/b/a/h/u;->b(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lb/c/b/a/h/g;->a:Lb/c/b/a/h/u;

    invoke-virtual {v0, p1}, Lb/c/b/a/h/u;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
