.class final Lb/c/b/a/e/f/d;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:Landroid/app/Activity;

.field private final synthetic g:Ljava/lang/String;

.field private final synthetic h:Ljava/lang/String;

.field private final synthetic i:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/d;->i:Lb/c/b/a/e/f/i0;

    iput-object p2, p0, Lb/c/b/a/e/f/d;->f:Landroid/app/Activity;

    iput-object p3, p0, Lb/c/b/a/e/f/d;->g:Ljava/lang/String;

    iput-object p4, p0, Lb/c/b/a/e/f/d;->h:Ljava/lang/String;

    invoke-direct {p0, p1}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    iget-object v0, p0, Lb/c/b/a/e/f/d;->i:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v1

    iget-object v0, p0, Lb/c/b/a/e/f/d;->f:Landroid/app/Activity;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v2

    iget-object v3, p0, Lb/c/b/a/e/f/d;->g:Ljava/lang/String;

    iget-object v4, p0, Lb/c/b/a/e/f/d;->h:Ljava/lang/String;

    iget-wide v5, p0, Lb/c/b/a/e/f/i0$a;->b:J

    invoke-interface/range {v1 .. v6}, Lb/c/b/a/e/f/d0;->a(Lb/c/b/a/d/a;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method
