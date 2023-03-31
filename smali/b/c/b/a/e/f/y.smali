.class final Lb/c/b/a/e/f/y;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:Landroid/app/Activity;

.field private final synthetic g:Lb/c/b/a/e/f/i0$b;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0$b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/y;->g:Lb/c/b/a/e/f/i0$b;

    iput-object p2, p0, Lb/c/b/a/e/f/y;->f:Landroid/app/Activity;

    iget-object p1, p1, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    invoke-direct {p0, p1}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    iget-object v0, p0, Lb/c/b/a/e/f/y;->g:Lb/c/b/a/e/f/i0$b;

    iget-object v0, v0, Lb/c/b/a/e/f/i0$b;->b:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v0

    iget-object v1, p0, Lb/c/b/a/e/f/y;->f:Landroid/app/Activity;

    invoke-static {v1}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v1

    iget-wide v2, p0, Lb/c/b/a/e/f/i0$a;->c:J

    invoke-interface {v0, v1, v2, v3}, Lb/c/b/a/e/f/d0;->b(Lb/c/b/a/d/a;J)V

    return-void
.end method
