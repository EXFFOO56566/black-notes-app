.class final Lb/c/b/a/e/f/r;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:Ljava/lang/Long;

.field private final synthetic g:Ljava/lang/String;

.field private final synthetic h:Ljava/lang/String;

.field private final synthetic i:Landroid/os/Bundle;

.field private final synthetic j:Z

.field private final synthetic k:Z

.field private final synthetic l:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/r;->l:Lb/c/b/a/e/f/i0;

    iput-object p2, p0, Lb/c/b/a/e/f/r;->f:Ljava/lang/Long;

    iput-object p3, p0, Lb/c/b/a/e/f/r;->g:Ljava/lang/String;

    iput-object p4, p0, Lb/c/b/a/e/f/r;->h:Ljava/lang/String;

    iput-object p5, p0, Lb/c/b/a/e/f/r;->i:Landroid/os/Bundle;

    iput-boolean p6, p0, Lb/c/b/a/e/f/r;->j:Z

    iput-boolean p7, p0, Lb/c/b/a/e/f/r;->k:Z

    invoke-direct {p0, p1}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 10

    iget-object v0, p0, Lb/c/b/a/e/f/r;->f:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lb/c/b/a/e/f/i0$a;->b:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    move-wide v8, v0

    iget-object v0, p0, Lb/c/b/a/e/f/r;->l:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v2

    iget-object v3, p0, Lb/c/b/a/e/f/r;->g:Ljava/lang/String;

    iget-object v4, p0, Lb/c/b/a/e/f/r;->h:Ljava/lang/String;

    iget-object v5, p0, Lb/c/b/a/e/f/r;->i:Landroid/os/Bundle;

    iget-boolean v6, p0, Lb/c/b/a/e/f/r;->j:Z

    iget-boolean v7, p0, Lb/c/b/a/e/f/r;->k:Z

    invoke-interface/range {v2 .. v9}, Lb/c/b/a/e/f/d0;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method
