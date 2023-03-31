.class final Lb/c/b/a/e/f/p;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:Ljava/lang/String;

.field private final synthetic g:Ljava/lang/String;

.field private final synthetic h:Ljava/lang/Object;

.field private final synthetic i:Z

.field private final synthetic j:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/p;->j:Lb/c/b/a/e/f/i0;

    iput-object p2, p0, Lb/c/b/a/e/f/p;->f:Ljava/lang/String;

    iput-object p3, p0, Lb/c/b/a/e/f/p;->g:Ljava/lang/String;

    iput-object p4, p0, Lb/c/b/a/e/f/p;->h:Ljava/lang/Object;

    iput-boolean p5, p0, Lb/c/b/a/e/f/p;->i:Z

    invoke-direct {p0, p1}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 8

    iget-object v0, p0, Lb/c/b/a/e/f/p;->j:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v1

    iget-object v2, p0, Lb/c/b/a/e/f/p;->f:Ljava/lang/String;

    iget-object v3, p0, Lb/c/b/a/e/f/p;->g:Ljava/lang/String;

    iget-object v0, p0, Lb/c/b/a/e/f/p;->h:Ljava/lang/Object;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v4

    iget-boolean v5, p0, Lb/c/b/a/e/f/p;->i:Z

    iget-wide v6, p0, Lb/c/b/a/e/f/i0$a;->b:J

    invoke-interface/range {v1 .. v7}, Lb/c/b/a/e/f/d0;->a(Ljava/lang/String;Ljava/lang/String;Lb/c/b/a/d/a;ZJ)V

    return-void
.end method
