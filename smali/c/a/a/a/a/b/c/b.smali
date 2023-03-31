.class public Lc/a/a/a/a/b/c/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lc/a/a/a/a/b/c/b;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lc/a/a/a/a/b/c/b;->a:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc/a/a/a/a/b/c/b;->b:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lc/a/a/a/a/b/c/b;->c:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc/a/a/a/a/b/c/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lc/a/a/a/a/b/c/b;->c:Z

    return v0
.end method
