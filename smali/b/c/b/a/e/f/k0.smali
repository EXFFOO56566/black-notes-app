.class final Lb/c/b/a/e/f/k0;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:Ljava/lang/String;

.field private final synthetic g:Ljava/lang/String;

.field private final synthetic h:Landroid/os/Bundle;

.field private final synthetic i:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/k0;->i:Lb/c/b/a/e/f/i0;

    iput-object p2, p0, Lb/c/b/a/e/f/k0;->f:Ljava/lang/String;

    iput-object p3, p0, Lb/c/b/a/e/f/k0;->g:Ljava/lang/String;

    iput-object p4, p0, Lb/c/b/a/e/f/k0;->h:Landroid/os/Bundle;

    invoke-direct {p0, p1}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    iget-object v0, p0, Lb/c/b/a/e/f/k0;->i:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v0

    iget-object v1, p0, Lb/c/b/a/e/f/k0;->f:Ljava/lang/String;

    iget-object v2, p0, Lb/c/b/a/e/f/k0;->g:Ljava/lang/String;

    iget-object v3, p0, Lb/c/b/a/e/f/k0;->h:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, v3}, Lb/c/b/a/e/f/d0;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
