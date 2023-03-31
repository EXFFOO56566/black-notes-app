.class final Lb/c/b/a/e/f/m;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:Landroid/os/Bundle;

.field private final synthetic g:Lb/c/b/a/e/f/b0;

.field private final synthetic h:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;Landroid/os/Bundle;Lb/c/b/a/e/f/b0;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/m;->h:Lb/c/b/a/e/f/i0;

    iput-object p2, p0, Lb/c/b/a/e/f/m;->f:Landroid/os/Bundle;

    iput-object p3, p0, Lb/c/b/a/e/f/m;->g:Lb/c/b/a/e/f/b0;

    invoke-direct {p0, p1}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 5

    iget-object v0, p0, Lb/c/b/a/e/f/m;->h:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v0

    iget-object v1, p0, Lb/c/b/a/e/f/m;->f:Landroid/os/Bundle;

    iget-object v2, p0, Lb/c/b/a/e/f/m;->g:Lb/c/b/a/e/f/b0;

    iget-wide v3, p0, Lb/c/b/a/e/f/i0$a;->b:J

    invoke-interface {v0, v1, v2, v3, v4}, Lb/c/b/a/e/f/d0;->a(Landroid/os/Bundle;Lb/c/b/a/e/f/e0;J)V

    return-void
.end method

.method protected final b()V
    .locals 2

    iget-object v0, p0, Lb/c/b/a/e/f/m;->g:Lb/c/b/a/e/f/b0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb/c/b/a/e/f/b0;->h(Landroid/os/Bundle;)V

    return-void
.end method
